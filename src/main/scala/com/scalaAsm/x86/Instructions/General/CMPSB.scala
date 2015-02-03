package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare String Operands
// Category: general/arithstring/binary

object CMPSB extends InstructionDefinition("CMPSB") with CMPSBImpl

trait CMPSBImpl {
  implicit object CMPSB_0 extends CMPSB._0 {
    val opcode: OneOpcode = 0xA6
    override def hasImplicitOperand = true
  }
}
