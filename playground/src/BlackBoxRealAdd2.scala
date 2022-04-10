import chisel3._
import chisel3.util._
class BlackBoxRealAdd2 extends BlackBox with HasBlackBoxPath {
  val io = IO(new Bundle {
    val in1 = Input(UInt(64.W))
    val in2 = Input(UInt(64.W))
    val out = Output(UInt(64.W))
  })
  addPath("./playground/src/resources/BlackBoxRealAdd2.v")
}
