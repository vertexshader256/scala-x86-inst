package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Rotate
// Category: general/shftrot

object ROL extends InstructionDefinition("ROL") with ROLImpl

trait ROLImpl {
  implicit object ROL_0 extends ROL._2[rm8, imm8] {
    val opcode: OneOpcode = 0xC0 /+ 0
  }

  implicit object ROL_1 extends ROL._2[rm16, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 0
  }

  implicit object ROL_2 extends ROL._2[rm32, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 0
  }

  implicit object ROL_3 extends ROL._2[rm64, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 0
    override def prefix = REX.W(true)
  }

  implicit object ROL_4 extends ROL._1[rm8] {
    val opcode: OneOpcode = 0xD0 /+ 0
    override def hasImplicitOperand = true
  }

  implicit object ROL_5 extends ROL._1[rm16] {
    val opcode: OneOpcode = 0xD1 /+ 0
    override def hasImplicitOperand = true
  }

  implicit object ROL_6 extends ROL._1[rm32] {
    val opcode: OneOpcode = 0xD1 /+ 0
    override def hasImplicitOperand = true
  }

  implicit object ROL_7 extends ROL._1[rm64] {
    val opcode: OneOpcode = 0xD1 /+ 0
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
