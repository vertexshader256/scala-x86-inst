package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Test
// Category: general/compar

trait FTST extends InstructionDefinition {
  val mnemonic = "FTST"
}

object FTST extends ZeroOperands[FTST] with FTSTImpl

trait FTSTImpl extends FTST {
  implicit object FTST_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 4
        override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
