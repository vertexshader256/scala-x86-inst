package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Shift
// Category: general/shftrot

object SHR extends InstructionDefinition("SHR") with SHRImpl

trait SHRImpl {
  implicit object SHR_0 extends SHR._2[rm8, imm8] {
    val opcode: OneOpcode = 0xC0 /+ 5
  }

  implicit object SHR_1 extends SHR._2[rm16, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 5
  }

  implicit object SHR_2 extends SHR._2[rm32, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 5
  }

  implicit object SHR_3 extends SHR._2[rm64, imm8] {
    val opcode: OneOpcode = 0xC1 /+ 5
    override def prefix = REX.W(true)
  }

  implicit object SHR_4 extends SHR._1[rm8] {
    val opcode: OneOpcode = 0xD0 /+ 5
    override def hasImplicitOperand = true
  }

  implicit object SHR_5 extends SHR._1[rm16] {
    val opcode: OneOpcode = 0xD1 /+ 5
    override def hasImplicitOperand = true
  }

  implicit object SHR_6 extends SHR._1[rm32] {
    val opcode: OneOpcode = 0xD1 /+ 5
    override def hasImplicitOperand = true
  }

  implicit object SHR_7 extends SHR._1[rm64] {
    val opcode: OneOpcode = 0xD1 /+ 5
    override def prefix = REX.W(true)
    override def hasImplicitOperand = true
  }
}
