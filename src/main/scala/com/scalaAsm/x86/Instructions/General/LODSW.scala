package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load String
// Category: general/datamovstring

trait LODSW extends InstructionDefinition {
  val mnemonic = "LODSW"
}

object LODSW extends ZeroOperands[LODSW] with LODSWImpl

trait LODSWImpl extends LODSW {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xAD
        override def hasImplicitOperand = true
  }
}
