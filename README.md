Chisel Project Template
=======================

> Modify from [OpenXiangShan chisel-playground](https://github.com/OpenXiangShan/chisel-playground)

Another version of the [Chisel template](https://github.com/ucb-bar/chisel-template) supporting mill.
mill is another Scala/Java build tool without obscure DSL like SBT. It is much faster than SBT.

**This project uses Scalatest framework, not utest.**

Contents at a glance:

* `.gitignore` - helps Git ignore junk like generated files, build products, and temporary files.
* `build.sc` - instructs mill to build the Chisel project
* `Makefile` - rules to call mill
* `playground/src/GCD.scala` - GCD source file
* `playground/src/DecoupledGCD.scala` - another GCD source file
* `playground/src/Elaborate.scala` - wrapper file to call chisel command with the GCD module
* `playground/src/Top.scala` - top module, you can edit IO to fit external pins such as FPGA.
* `playground/test/src/GCDSpec.scala` - GCD tester. **Current project doesn't support utest framework.**

Feel free to rename or delete files under `playground/` or use them as a reference/template. **Don't rename the `playground` directory.**

## Getting Started

First, install mill by referring to the documentation [here](https://com-lihaoyi.github.io/mill).

Second,you should run `make idea` to initialize IntelliJ IDEA project, then you can open it using IDEA.

___

To run all tests in this design (recommended for test-driven development):
```bash
make test
```

To generate Verilog:
```bash
make verilog
```

To test a single file(you should assign the chisel test filename to name argument):

```bash
make test-only name=???
```

