IMAGE_LINGUAS = " "

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"

IMAGE_FEATURES += " \
    ssh-server-openssh \
"

IMAGE_INSTALL += " \
    coreutils \
    cpupower \
    htop \
    iperf2 \
    iperf3 \
    restic-rest-server \
    ssh-authorized-keys \
    tcpdump \
    wireguard-tools \
"

m1cha_postprocess_function() {
    ln -sf /media/data/wireguard/99-wg0.netdev ${IMAGE_ROOTFS}/etc/systemd/network/
    ln -sf /media/data/wireguard/99-wg0.network ${IMAGE_ROOTFS}/etc/systemd/network/
}

ROOTFS_POSTPROCESS_COMMAND += "m1cha_postprocess_function; "
