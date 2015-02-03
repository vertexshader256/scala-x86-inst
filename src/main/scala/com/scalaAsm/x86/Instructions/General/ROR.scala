package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Rotate
// Category: general/shftrot

object ROR extends InstructionDefinition("ROR") with RORImpl

trait RORImpl {
  implicit object ROR_0 extends ROR._2[rm8, imm8] {
    val opcode: OneOpcode = 0xC0 /+ 1
  }

  implicit object ROR_1 extends ROR._2[rm16, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 1
  }

  implicit object ROR_2 extends ROR._2[rm32, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 1
  }

  implicit object ROR_3 extends ROR._2[rm64, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 1
    override def prefix = REX.W(true)
  }

  implicit object ROR_4 extends ROR._1[rm8] {
    val opcode: OneOpcode = 0xD0 /+ 1
    override def hasImplicitOperand = true
  }

  implicit object ROR_5 extends ROR._1[rm16] {
    val opcode: OneOpcode = 0xD1 /+ 1
    override def hasImplicitOperand = true
  }

  implicit object ROR_6 extends ROR._1[rm32] {
    val opcode: OneOpcode = 0xD1 /+ 1
    override def hasImplicitOperand = true
  }

  implicit object ROR_7 extends ROR._1[rm64] {
    val opcode: OneOpcode = 0xD1 /+ 1
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
