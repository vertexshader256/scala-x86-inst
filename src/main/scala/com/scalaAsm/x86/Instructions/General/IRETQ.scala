package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Interrupt Return
// Category: general/breakstack

object IRETQ extends InstructionDefinition("IRETQ") with IRETQImpl

trait IRETQImpl {
  implicit object IRETQ_0 extends IRETQ._0 {
    val opcode: OneOpcode = 0xCF
    override def hasImplicitOperand = true
  }
}
