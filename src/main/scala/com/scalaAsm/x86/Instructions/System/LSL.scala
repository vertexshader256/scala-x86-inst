package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Segment Limit
// Category: general

trait LSL extends InstructionDefinition {
  val mnemonic = "LSL"
}

object LSL extends TwoOperands[LSL] with LSLImpl

trait LSLImpl extends LSL {
  implicit object _0 extends TwoOp[r16, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x03) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x03) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, m16] {
    val opcode: TwoOpcodes = (0x0F, 0x03) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }

  implicit object _3 extends TwoOp[r16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0x03) /r
    val format = RegRmFormat
  }

  implicit object _4 extends TwoOp[r32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0x03) /r
    val format = RegRmFormat
  }

  implicit object _5 extends TwoOp[r64, r32] {
    val opcode: TwoOpcodes = (0x0F, 0x03) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
