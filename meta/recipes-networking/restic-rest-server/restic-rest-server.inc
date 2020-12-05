SRC_URI += " \
    file://restic-rest-server.service \
"

DEPENDS += "openssl"
#RDEPENDS_${PN} += "openssl-dev"

inherit useradd systemd

USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = " --system -s /bin/false -u 1200 -N -g restic-rest restic-rest"
GROUPADD_PARAM_${PN} = "-g 1200 restic-rest"

SYSTEMD_SERVICE_${PN} = "restic-rest-server.service"

do_install_append () {
	install -d ${D}${systemd_unitdir}/system
    install -c -m 0644 ${WORKDIR}/restic-rest-server.service ${D}${systemd_unitdir}/system
}
