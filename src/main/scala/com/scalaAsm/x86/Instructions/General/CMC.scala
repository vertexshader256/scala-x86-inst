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

object CMC extends CMC with CMCImpl

trait CMCImpl {
  self: CMC =>
  implicit object CMC_0 extends _0 {
    val opcode: OneOpcode = 0xF5
  }
}
