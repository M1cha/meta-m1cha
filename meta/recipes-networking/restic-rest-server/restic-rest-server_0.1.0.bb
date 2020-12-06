# Auto-Generated by cargo-bitbake 0.3.15-alpha.0
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get restic-rest-server could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/restic-rest-server/0.1.0"
SRC_URI += "git://git@github.com/M1cha/restic-rest-server-rs.git;protocol=ssh;nobranch=1"
SRCREV = "9e7faf81c1d15e6913cabbac317875445ca9eee0"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV_append = ".AUTOINC+9e7faf81c1"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/actix-codec/0.3.0 \
    crate://crates.io/actix-connect/2.0.0 \
    crate://crates.io/actix-files/0.4.1 \
    crate://crates.io/actix-http/2.2.0 \
    crate://crates.io/actix-macros/0.1.3 \
    crate://crates.io/actix-router/0.2.5 \
    crate://crates.io/actix-rt/1.1.1 \
    crate://crates.io/actix-server/1.0.4 \
    crate://crates.io/actix-service/1.0.6 \
    crate://crates.io/actix-testing/1.0.1 \
    crate://crates.io/actix-threadpool/0.3.3 \
    crate://crates.io/actix-tls/2.0.0 \
    crate://crates.io/actix-utils/2.0.0 \
    crate://crates.io/actix-web-codegen/0.4.0 \
    crate://crates.io/actix-web/3.3.2 \
    crate://crates.io/addr2line/0.14.0 \
    crate://crates.io/adler/0.2.3 \
    crate://crates.io/aho-corasick/0.7.15 \
    crate://crates.io/ansi_term/0.11.0 \
    crate://crates.io/async-trait/0.1.42 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/awc/2.0.3 \
    crate://crates.io/backtrace/0.3.55 \
    crate://crates.io/base-x/0.2.8 \
    crate://crates.io/base64/0.13.0 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/brotli-sys/0.3.2 \
    crate://crates.io/brotli2/0.3.2 \
    crate://crates.io/buf-min/0.2.0 \
    crate://crates.io/bumpalo/3.4.0 \
    crate://crates.io/byteorder/1.3.4 \
    crate://crates.io/bytes/0.5.6 \
    crate://crates.io/bytes/0.6.0 \
    crate://crates.io/bytestring/0.1.5 \
    crate://crates.io/cc/1.0.66 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap/2.33.3 \
    crate://crates.io/const_fn/0.4.3 \
    crate://crates.io/cookie/0.14.3 \
    crate://crates.io/copyless/0.1.5 \
    crate://crates.io/cpuid-bool/0.1.2 \
    crate://crates.io/crc32fast/1.2.1 \
    crate://crates.io/derive_more/0.99.11 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/discard/1.0.4 \
    crate://crates.io/either/1.6.1 \
    crate://crates.io/encoding_rs/0.8.26 \
    crate://crates.io/enum-as-inner/0.3.3 \
    crate://crates.io/env_logger/0.8.2 \
    crate://crates.io/flate2/1.0.19 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.0.0 \
    crate://crates.io/fuchsia-zircon-sys/0.3.3 \
    crate://crates.io/fuchsia-zircon/0.3.3 \
    crate://crates.io/futures-channel/0.3.8 \
    crate://crates.io/futures-core/0.3.8 \
    crate://crates.io/futures-executor/0.3.8 \
    crate://crates.io/futures-io/0.3.8 \
    crate://crates.io/futures-macro/0.3.8 \
    crate://crates.io/futures-sink/0.3.8 \
    crate://crates.io/futures-task/0.3.8 \
    crate://crates.io/futures-util/0.3.8 \
    crate://crates.io/futures/0.3.8 \
    crate://crates.io/fxhash/0.2.1 \
    crate://crates.io/generic-array/0.14.4 \
    crate://crates.io/getrandom/0.1.15 \
    crate://crates.io/gimli/0.23.0 \
    crate://crates.io/h2/0.2.7 \
    crate://crates.io/hashbrown/0.9.1 \
    crate://crates.io/heck/0.3.1 \
    crate://crates.io/hermit-abi/0.1.17 \
    crate://crates.io/hostname/0.3.1 \
    crate://crates.io/http/0.2.1 \
    crate://crates.io/httparse/1.3.4 \
    crate://crates.io/humantime/2.0.1 \
    crate://crates.io/idna/0.2.0 \
    crate://crates.io/indexmap/1.6.0 \
    crate://crates.io/instant/0.1.9 \
    crate://crates.io/iovec/0.1.4 \
    crate://crates.io/ipconfig/0.2.2 \
    crate://crates.io/itoa/0.4.6 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/language-tags/0.2.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.80 \
    crate://crates.io/linked-hash-map/0.5.3 \
    crate://crates.io/lock_api/0.4.2 \
    crate://crates.io/log/0.4.11 \
    crate://crates.io/lru-cache/0.1.2 \
    crate://crates.io/match_cfg/0.1.0 \
    crate://crates.io/matches/0.1.8 \
    crate://crates.io/memchr/2.3.4 \
    crate://crates.io/mime/0.3.16 \
    crate://crates.io/mime_guess/2.0.3 \
    crate://crates.io/miniz_oxide/0.4.3 \
    crate://crates.io/mio-uds/0.6.8 \
    crate://crates.io/mio/0.6.23 \
    crate://crates.io/miow/0.2.2 \
    crate://crates.io/net2/0.2.36 \
    crate://crates.io/nom/4.2.3 \
    crate://crates.io/num_cpus/1.13.0 \
    crate://crates.io/object/0.22.0 \
    crate://crates.io/once_cell/1.5.2 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/openssl-sys/0.9.58 \
    crate://crates.io/openssl/0.10.30 \
    crate://crates.io/parking_lot/0.11.1 \
    crate://crates.io/parking_lot_core/0.8.1 \
    crate://crates.io/percent-encoding/2.1.0 \
    crate://crates.io/pin-project-internal/0.4.27 \
    crate://crates.io/pin-project-internal/1.0.2 \
    crate://crates.io/pin-project-lite/0.1.11 \
    crate://crates.io/pin-project-lite/0.2.0 \
    crate://crates.io/pin-project/0.4.27 \
    crate://crates.io/pin-project/1.0.2 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.19 \
    crate://crates.io/ppv-lite86/0.2.10 \
    crate://crates.io/proc-macro-hack/0.5.19 \
    crate://crates.io/proc-macro-nested/0.1.6 \
    crate://crates.io/proc-macro2/1.0.24 \
    crate://crates.io/quick-error/1.2.3 \
    crate://crates.io/quote/1.0.7 \
    crate://crates.io/rand/0.7.3 \
    crate://crates.io/rand_chacha/0.2.2 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_hc/0.2.0 \
    crate://crates.io/redox_syscall/0.1.57 \
    crate://crates.io/regex-syntax/0.6.21 \
    crate://crates.io/regex/1.4.2 \
    crate://crates.io/resolv-conf/0.7.0 \
    crate://crates.io/rustc-demangle/0.1.18 \
    crate://crates.io/rustc_version/0.2.3 \
    crate://crates.io/ryu/1.0.5 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/semver-parser/0.7.0 \
    crate://crates.io/semver/0.9.0 \
    crate://crates.io/serde/1.0.117 \
    crate://crates.io/serde_derive/1.0.117 \
    crate://crates.io/serde_json/1.0.60 \
    crate://crates.io/serde_urlencoded/0.7.0 \
    crate://crates.io/sha-1/0.9.2 \
    crate://crates.io/sha1/0.6.0 \
    crate://crates.io/signal-hook-registry/1.2.2 \
    crate://crates.io/slab/0.4.2 \
    crate://crates.io/smallvec/1.5.1 \
    crate://crates.io/socket2/0.3.17 \
    crate://crates.io/standback/0.2.13 \
    crate://crates.io/stdweb-derive/0.5.3 \
    crate://crates.io/stdweb-internal-macros/0.2.9 \
    crate://crates.io/stdweb-internal-runtime/0.1.5 \
    crate://crates.io/stdweb/0.4.20 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/syn/1.0.53 \
    crate://crates.io/termcolor/1.1.2 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/thiserror-impl/1.0.22 \
    crate://crates.io/thiserror/1.0.22 \
    crate://crates.io/thread_local/1.0.1 \
    crate://crates.io/threadpool/1.8.1 \
    crate://crates.io/time-macros-impl/0.1.1 \
    crate://crates.io/time-macros/0.1.1 \
    crate://crates.io/time/0.2.23 \
    crate://crates.io/tinyvec/1.1.0 \
    crate://crates.io/tinyvec_macros/0.1.0 \
    crate://crates.io/tokio-openssl/0.4.0 \
    crate://crates.io/tokio-util/0.3.1 \
    crate://crates.io/tokio/0.2.23 \
    crate://crates.io/tracing-core/0.1.17 \
    crate://crates.io/tracing-futures/0.2.4 \
    crate://crates.io/tracing/0.1.22 \
    crate://crates.io/trust-dns-proto/0.19.6 \
    crate://crates.io/trust-dns-resolver/0.19.6 \
    crate://crates.io/typenum/1.12.0 \
    crate://crates.io/unicase/2.6.0 \
    crate://crates.io/unicode-bidi/0.3.4 \
    crate://crates.io/unicode-normalization/0.1.16 \
    crate://crates.io/unicode-segmentation/1.7.1 \
    crate://crates.io/unicode-width/0.1.8 \
    crate://crates.io/unicode-xid/0.2.1 \
    crate://crates.io/url/2.2.0 \
    crate://crates.io/v_escape/0.14.1 \
    crate://crates.io/v_escape_derive/0.8.4 \
    crate://crates.io/v_htmlescape/0.11.0 \
    crate://crates.io/vcpkg/0.2.10 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/version_check/0.1.5 \
    crate://crates.io/version_check/0.9.2 \
    crate://crates.io/wasi/0.9.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.69 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.69 \
    crate://crates.io/wasm-bindgen-macro/0.2.69 \
    crate://crates.io/wasm-bindgen-shared/0.2.69 \
    crate://crates.io/wasm-bindgen/0.2.69 \
    crate://crates.io/widestring/0.4.3 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/winreg/0.6.2 \
    crate://crates.io/ws2_32-sys/0.2.1 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=5040e467e8fd4daf9f11f923fb91a69f \
"

SUMMARY = "rust version of restics rest-server"
HOMEPAGE = "https://github.com/M1cha/restic-rest-server-rs"
LICENSE = "MIT"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include restic-rest-server-${PV}.inc
include restic-rest-server.inc