package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load String
// Category: general/datamovstring

object LODSD extends InstructionDefinition("LODSD") with LODSDImpl

trait LODSDImpl {
  implicit object LODSD_0 extends LODSD._0 {
    val opcode: OneOpcode = 0xAD
    override def hasImplicitOperand = true
  }
}
