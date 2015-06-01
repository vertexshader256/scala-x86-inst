package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Complement Carry Flag
// Category: general/flgctrl

trait CMC extends InstructionDefinition {
  val mnemonic = "CMC"
}

object CMC extends ZeroOperands[CMC] with CMCImpl

trait CMCImpl extends CMC {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xF5
      }
}
