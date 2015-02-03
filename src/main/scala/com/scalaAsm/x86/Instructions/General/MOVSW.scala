package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move Data from String to String
// Category: general/datamovstring

object MOVSW extends InstructionDefinition("MOVSW") with MOVSWImpl

trait MOVSWImpl {
  implicit object MOVSW_0 extends MOVSW._0 {
    val opcode: OneOpcode = 0xA5
    override def hasImplicitOperand = true
  }
}
