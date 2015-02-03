package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Scan String
// Category: general/arithstring/binary

object SCASW extends InstructionDefinition("SCASW") with SCASWImpl

trait SCASWImpl {
  implicit object SCASW_0 extends SCASW._0 {
    val opcode: OneOpcode = 0xAF
    override def hasImplicitOperand = true
  }
}
