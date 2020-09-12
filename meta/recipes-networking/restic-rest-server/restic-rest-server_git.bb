SUMMARY = "a high performance HTTP server that implements restic's REST backend API"
HOMEPAGE = "https://github.com/restic/rest-server"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=cb250f8af790493909582ed6e105f15a"

GO_IMPORT = "github.com/restic/rest-server"
SRC_URI = " \
    git://${GO_IMPORT} \
    file://restic-rest-server.service \
"
SRCREV = "06f8484400d0066800378908e769a3f417c45775"

inherit go useradd systemd

USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = " --system -s /bin/false -u 1200 -N -g restic-rest restic-rest"
GROUPADD_PARAM_${PN} = "-g 1200 restic-rest"

SYSTEMD_SERVICE_${PN} = "restic-rest-server.service"

export GO111MODULE = "off"
GO_INSTALL = "${GO_IMPORT}/cmd/rest-server"

RDEPENDS_${PN}-dev += "bash"
RDEPENDS_${PN}-ptest += "bash"

BBCLASSEXTEND = "native nativesdk"

do_configure_append() {
    cd "${S}/src/${GO_IMPORT}" && go get ./...
}

do_install_append () {
	install -d ${D}${systemd_unitdir}/system
    install -c -m 0644 ${WORKDIR}/restic-rest-server.service ${D}${systemd_unitdir}/system
}
