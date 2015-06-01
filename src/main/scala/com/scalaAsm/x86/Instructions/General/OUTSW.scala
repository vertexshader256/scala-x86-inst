package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Output String to Port
// Category: general/inoutstring

trait OUTSW extends InstructionDefinition {
  val mnemonic = "OUTSW"
}

object OUTSW extends ZeroOperands[OUTSW] with OUTSWImpl

trait OUTSWImpl extends OUTSW {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x6F
        override def hasImplicitOperand = true
  }
}
