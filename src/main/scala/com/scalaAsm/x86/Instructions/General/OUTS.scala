package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Output String to Port
// Category: general/inoutstring

trait OUTS extends InstructionDefinition {
  val mnemonic = "OUTS"
}

object OUTS extends ZeroOperands[OUTS] with OUTSImpl

trait OUTSImpl extends OUTS {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x6E
        override def hasImplicitOperand = true
  }
}
