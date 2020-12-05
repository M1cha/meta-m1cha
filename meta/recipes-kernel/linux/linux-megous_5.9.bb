KBRANCH ?= "orange-pi-5.9"

require recipes-kernel/linux/linux-yocto.inc

SRCREV_machine ?= "6f2d95b9833e4e2395ca58056c1489fa77eb5810"
SRCREV_meta ?= "7329d33cf8f25f433ce8ca95787e1743344f7c5d"

KCONFIG_MODE = "--alldefconfig"
KBUILD_DEFCONFIG ?= "orangepi_defconfig"

SRC_URI = "git://github.com/megous/linux;protocol=https;name=machine;branch=${KBRANCH}; \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-5.8;destsuffix=${KMETA}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "5.9.11"

DEPENDS += "${@bb.utils.contains('ARCH', 'x86', 'elfutils-native', '', d)}"
DEPENDS += "openssl-native util-linux-native"

PV = "${LINUX_VERSION}+git${SRCPV}"

KMETA = "kernel-meta"
KCONF_BSP_AUDIT_LEVEL = "2"

COMPATIBLE_MACHINE = "(sun50i)"

# Functionality flags
KERNEL_EXTRA_FEATURES ?= "features/netfilter/netfilter.scc"
KERNEL_FEATURES_append = " ${KERNEL_EXTRA_FEATURES}"
