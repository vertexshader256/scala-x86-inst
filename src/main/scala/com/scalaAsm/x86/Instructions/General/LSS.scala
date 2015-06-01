package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Far Pointer
// Category: general/datamovsegreg

trait LSS extends InstructionDefinition {
  val mnemonic = "LSS"
}

object LSS extends TwoOperands[LSS] with LSSImpl

trait LSSImpl extends LSS {
  implicit object _0 extends TwoOp[r16, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB2) /r
    val format = RegRmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends TwoOp[r32, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB2) /r
    val format = RegRmFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends TwoOp[r64, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB2) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    override def hasImplicitOperand = true
  }
}
