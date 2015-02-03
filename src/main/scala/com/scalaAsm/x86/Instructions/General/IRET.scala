package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Interrupt Return
// Category: general/breakstack

object IRET extends InstructionDefinition("IRET") with IRETImpl

trait IRETImpl {
  implicit object IRET_0 extends IRET._0 {
    val opcode: OneOpcode = 0xCF
    override def hasImplicitOperand = true
  }
}
