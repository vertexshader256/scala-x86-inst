package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Divide and Pop
// Category: general/arith

trait FDIVP extends InstructionDefinition {
  val mnemonic = "FDIVP"
}

object FDIVP extends ZeroOperands[FDIVP] with FDIVPImpl

trait FDIVPImpl extends FDIVP {
  implicit object FDIVP_0 extends _0 {
    val opcode: OneOpcode = 0xDE /+ 7
    override def hasImplicitOperand = true
  }
}
