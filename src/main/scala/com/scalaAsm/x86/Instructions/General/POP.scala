package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Pop a Value from the Stack
// Category: general/stacksegreg

trait POP extends InstructionDefinition {
  val mnemonic = "POP"
}

object POP extends ZeroOperands[POP] with OneOperand[POP] with POPImpl

trait POPLow extends POP {
  implicit object POP_0 extends _1[rm16] {
    val opcode: OneOpcode = 0x8F /+ 0
    override def hasImplicitOperand = true
  }

  implicit object POP_1 extends _1[rm32] {
    val opcode: OneOpcode = 0x8F /+ 0
    override def hasImplicitOperand = true
  }

  implicit object POP_2 extends _1[rm64] {
    val opcode: OneOpcode = 0x8F /+ 0
    override def hasImplicitOperand = true
  }
}

trait POPImpl extends POPLow {
  implicit object POP_3 extends _0 {
    val opcode: OneOpcode = 0x07
    override def hasImplicitOperand = true
  }

  implicit object POP_4 extends _1[r16] {
    val opcode: OneOpcode = 0x58 + rw
    override def explicitFormat(op1: r16) = Some(InstructionFormat(addressingForm = NoModRM(), immediate = None))
    override def hasImplicitOperand = true
  }

  implicit object POP_5 extends _1[r32] {
    val opcode: OneOpcode = 0x58 + rd
    override def explicitFormat(op1: r32) = Some(InstructionFormat(addressingForm = NoModRM(), immediate = None))
    override def hasImplicitOperand = true
  }

  implicit object POP_6 extends _1[r64] {
    val opcode: OneOpcode = 0x58 + ro
    override def explicitFormat(op1: r64) = Some(InstructionFormat(addressingForm = NoModRM(), immediate = None))
    override def hasImplicitOperand = true
  }
}
