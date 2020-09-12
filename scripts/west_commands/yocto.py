from west.commands import WestCommand
from west import log
from west import util
from pathlib import Path
import os
import subprocess

class Yocto(WestCommand):
    def __init__(self):
        super().__init__(
            "yocto",
            "",
            None)

        self.top_dir = util.west_topdir()
        self.project_dir = Path(os.path.dirname(os.path.realpath(__file__))).parent.parent

    def do_add_parser(self, parser_adder):
        return parser_adder.add_parser(self.name,
                                       add_help=True,
                                       description=self.description)

    def do_run(self, args, unknown_args):
        env = os.environ.copy()
        del env['ZEPHYR_BASE']

        args = [
            os.path.join(self.project_dir, 'scripts/yoctoshell.sh'),
        ]

        p = subprocess.Popen(args, cwd=self.top_dir, env=env)
        p.communicate()

        if p.returncode:
            raise subprocess.CalledProcessError(p.returncode, args)