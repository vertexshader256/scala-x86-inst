package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Increment Stack-Top Pointer
// Category: general/control

trait FINCSTP extends InstructionDefinition {
  val mnemonic = "FINCSTP"
}

object FINCSTP extends ZeroOperands[FINCSTP] with FINCSTPImpl

trait FINCSTPImpl extends FINCSTP {
  implicit object FINCSTP_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 6
        val hasRMByte = true
  }
}
