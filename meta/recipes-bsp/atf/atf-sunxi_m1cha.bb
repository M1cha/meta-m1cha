DESCRIPTION = "ARM Trusted Firmware m1cha"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://docs/license.rst;md5=189505435dbcdcc8caa63c46fe93fa89"

SRC_URI = "git://github.com/ARM-software/arm-trusted-firmware;nobranch=1"
SRCREV = "a04808c16cfc126d9fe572ae7c4b5a3d39de5796"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

COMPATIBLE_MACHINE = "(sun50i)"

LDFLAGS[unexport] = "1"

do_compile() {
    oe_runmake -C ${S} BUILD_BASE=${B} \
      CROSS_COMPILE=${TARGET_PREFIX} \
      PLAT=${ATF_PLATFORM} \
      bl31 \
      all
}

do_install() {
    install -D -p -m 0644 ${B}/${ATF_PLATFORM}/release/bl31.bin ${DEPLOY_DIR_IMAGE}/bl31.bin
}
