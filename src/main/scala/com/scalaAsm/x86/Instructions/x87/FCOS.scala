package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Cosine
// Category: general/trans

trait FCOS extends InstructionDefinition {
  val mnemonic = "FCOS"
}

object FCOS extends ZeroOperands[FCOS] with FCOSImpl

trait FCOSImpl extends FCOS {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 7
        override def hasImplicitOperand = true
  }
}
