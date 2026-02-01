SUMMARY = "Persistent network interface rename (udev rule) + network config"
LICENSE = "CLOSED"

SRC_URI = "file://70-net-names.rules \
          "

S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install() {
    # udev rule
    install -d ${D}${sysconfdir}/udev/rules.d
    install -m 0644 ${UNPACKDIR}/70-net-names.rules \
        ${D}${sysconfdir}/udev/rules.d/70-net-names.rules
}

FILES:${PN} += " \
    ${sysconfdir}/udev/rules.d/70-net-names.rules \
"
