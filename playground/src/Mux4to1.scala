import chisel3._
import chisel3.util._

class Mux4to1IO(width: Int) extends MuxIO(width) {
  val a2 = Input(UInt(width.W))
  val a3 = Input(UInt(width.W))
  override val s = Input(UInt(2.W))
}

class Mux4to1 extends Module {
  val io = IO(new Mux4to1IO(2))

  io.o := Mux(
    io.s(1) === 0.U,
    Mux(io.s(0) === 0.U, io.a0, io.a1),
    Mux(io.s(0) === 0.U, io.a2, io.a3),
  )

}

