package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set AL If Carry
// Category: general/datamov

object SALC extends InstructionDefinition("SALC") with SALCImpl

trait SALCImpl {
  implicit object SALC_0 extends SALC._0 {
    val opcode: OneOpcode = 0xD6
    override def hasImplicitOperand = true
  }
}
