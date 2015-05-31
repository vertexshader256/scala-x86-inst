package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Table Look-up Translation
// Category: general/datamov

trait XLATB extends InstructionDefinition {
  val mnemonic = "XLATB"
}

object XLATB extends ZeroOperands[XLATB] with XLATBImpl

trait XLATBImpl extends XLATB {
  implicit object XLATB_0 extends _0 {
    val opcode: OneOpcode = 0xD7
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
