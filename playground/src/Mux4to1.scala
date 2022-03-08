import chisel3._
import chisel3.util._

class Mux4to1IO(width: Int) extends MuxIO(width) {
  val a2 = Input(UInt(width.W))
  val a3 = Input(UInt(width.W))
  override val s = Input(UInt(2.W))
}

class Mux4to1 extends Module {
  val io = IO(new Mux4to1IO(2))

  /*
  * Compare the first plan with the second
  * 第一个方案是并行的,第二个是串行的,第一个延迟更小
  * */

  /* first */
  io.o := Mux(
    io.s(1) === 0.U,
    Mux(io.s(0) === 0.U, io.a0, io.a1),
    Mux(io.s(0) === 0.U, io.a2, io.a3),
  )

  /* second */
  //  io.o := 0.U
  //  switch(io.s) {
  //    is("b00".U) {
  //      io.o := io.a0
  //    }
  //    is("b01".U) {
  //      io.o := io.a1
  //    }
  //    is("b10".U) {
  //      io.o := io.a2
  //    }
  //    is("b11".U) {
  //      io.o := io.a3
  //    }
  //  }
}

