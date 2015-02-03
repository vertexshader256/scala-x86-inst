package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move Data from String to String
// Category: general/datamovstring

object MOVS extends InstructionDefinition("MOVS") with MOVSImpl

trait MOVSImpl {
  implicit object MOVS_0 extends MOVS._0 {
    val opcode: OneOpcode = 0xA4
    override def hasImplicitOperand = true
  }
}
