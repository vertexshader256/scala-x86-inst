package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Carry Flag
// Category: general/flgctrl

trait STC extends InstructionDefinition {
  val mnemonic = "STC"
}

object STC extends ZeroOperands[STC] with STCImpl

trait STCImpl extends STC {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xF9
      }
}
