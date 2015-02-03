package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Multiply
// Category: general/arith

object FMUL extends InstructionDefinition("FMUL") with FMULImpl

trait FMULImpl {
  implicit object FMUL_0 extends FMUL._1[m32] {
    val opcode: OneOpcode = 0xD8 /+ 1
    override def hasImplicitOperand = true
  }

  implicit object FMUL_1 extends FMUL._1[m64] {
    val opcode: OneOpcode = 0xDC /+ 1
    override def hasImplicitOperand = true
  }
}
