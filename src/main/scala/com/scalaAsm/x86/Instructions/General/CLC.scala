package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Clear Carry Flag
// Category: general/flgctrl

trait CLC extends InstructionDefinition {
  val mnemonic = "CLC"
}

object CLC extends ZeroOperands[CLC] with CLCImpl

trait CLCImpl extends CLC {
  implicit object CLC_0 extends _0 {
    val opcode: OneOpcode = 0xF8
        val hasRMByte = false
  }
}
