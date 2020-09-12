DESCRIPTION = "U-Boot, a boot loader for sunxi"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native bc-native dtc-native"
DEPENDS_append_sun50i = " atf-sunxi "

COMPATIBLE_MACHINE = "(sun50i)"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"
PE = "1"
PV = "v2020.07+git${SRCPV}"

# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "e44d878a0fe5b7928b542e5586a1ec12794dde7d"

SRC_URI = " \
          git://megous.com/git/u-boot;protocol=https;branch=opi-v2020.07 \
          file://boot.cmd \
          "

UBOOT_ENV_SUFFIX = "scr"
UBOOT_ENV = "boot"

EXTRA_OEMAKE_append_sun50i = " BL31=${DEPLOY_DIR_IMAGE}/bl31.bin "

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
do_configure[cleandirs] = "${B}"

require recipes-bsp/u-boot/u-boot.inc

do_compile_sun50i[depends] += "atf-sunxi:do_deploy"

do_compile_append() {
    ${B}/tools/mkimage -C none -A arm -T script -d ${WORKDIR}/boot.cmd ${WORKDIR}/${UBOOT_ENV_BINARY}
}
