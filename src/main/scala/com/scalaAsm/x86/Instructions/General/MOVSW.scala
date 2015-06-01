package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move Data from String to String
// Category: general/datamovstring

trait MOVSW extends InstructionDefinition {
  val mnemonic = "MOVSW"
}

object MOVSW extends ZeroOperands[MOVSW] with MOVSWImpl

trait MOVSWImpl extends MOVSW {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xA5
        override def hasImplicitOperand = true
  }
}
