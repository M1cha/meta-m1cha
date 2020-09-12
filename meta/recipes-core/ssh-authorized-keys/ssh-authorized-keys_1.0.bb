LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = " \
    file://m1cha.pub \
"

inherit allarch

SSH_USER ?= "root"

FILES_${PN} += "/home/${SSH_USER}/.ssh/authorized_keys"

do_install() {
        install -d ${D}/home/${SSH_USER}/.ssh/
        cat ${WORKDIR}/*.pub > ${D}/home/${SSH_USER}/.ssh/authorized_keys
        chmod 600 ${D}/home/${SSH_USER}/.ssh/authorized_keys
}