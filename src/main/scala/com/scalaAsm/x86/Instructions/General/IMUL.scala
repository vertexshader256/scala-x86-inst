package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Signed Multiply
// Category: general/arith/binary

trait IMUL extends InstructionDefinition {
  val mnemonic = "IMUL"
}

object IMUL extends OneOperand[IMUL] with TwoOperands[IMUL] with IMULImpl

trait IMULLow extends IMUL {
  implicit object _0 extends OneOp[rm8] {
    val opcode: OneOpcode = 0xF6 /+ 5
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[rm16] {
    val opcode: OneOpcode = 0xF7 /+ 5
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _2 extends OneOp[rm32] {
    val opcode: OneOpcode = 0xF7 /+ 5
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _3 extends OneOp[rm64] {
    val opcode: OneOpcode = 0xF7 /+ 5
    override def prefix = REX.W(true)
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}

trait IMULImpl extends IMULLow {
  implicit object _4 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xAF) /r
    val format = RegRmFormat
  }

  implicit object _5 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0xAF) /r
    val format = RegRmFormat
  }

  implicit object _6 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0xAF) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
