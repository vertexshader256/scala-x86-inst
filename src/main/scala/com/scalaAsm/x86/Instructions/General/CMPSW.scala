package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare String Operands
// Category: general/arithstring/binary

object CMPSW extends InstructionDefinition("CMPSW") with CMPSWImpl

trait CMPSWImpl {
  implicit object CMPSW_0 extends CMPSW._0 {
    val opcode: OneOpcode = 0xA7
    override def hasImplicitOperand = true
  }
}
