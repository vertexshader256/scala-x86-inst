package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set AL If Carry
// Category: general/datamov

object SETALC extends InstructionDefinition("SETALC") with SETALCImpl

trait SETALCImpl {
  implicit object SETALC_0 extends SETALC._0 {
    val opcode: OneOpcode = 0xD6
    override def hasImplicitOperand = true
  }
}
