import chisel3._
import chisel3.util._

class TopModuleIO extends Bundle {
  val sw = Input(UInt(10.W))
  val leds = Output(UInt(2.W))
}

class Top extends Module {
  val io = IO(new TopModuleIO)

  val mux4to1 = Module(new Mux4to1)
  
  mux4to1.io.s := io.sw(1, 0)
  mux4to1.io.a0 := io.sw(3, 2)
  mux4to1.io.a1 := io.sw(5, 4)
  mux4to1.io.a2 := io.sw(7, 6)
  mux4to1.io.a3 := io.sw(9, 8)

  io.leds := mux4to1.io.o
}

