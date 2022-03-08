
import chisel3._

class MuxIO(width: Int) extends Bundle {
  val a0 = Input(UInt(width.W))
  val a1 = Input(UInt(width.W))

  val s = Input(UInt(1.W))

  val o = Output(UInt(width.W))
}

class Mux2to1 extends Module {
  val io = IO(new MuxIO(32))

  io.o := Mux(io.s === 0.U, io.a0, io.a1);
}


