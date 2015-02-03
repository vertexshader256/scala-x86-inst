package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load String
// Category: general/datamovstring

object LODSW extends InstructionDefinition("LODSW") with LODSWImpl

trait LODSWImpl {
  implicit object LODSW_0 extends LODSW._0 {
    val opcode: OneOpcode = 0xAD
    override def hasImplicitOperand = true
  }
}
