package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Clear Exceptions
// Category: general/control

trait FNCLEX extends InstructionDefinition {
  val mnemonic = "FNCLEX"
}

object FNCLEX extends ZeroOperands[FNCLEX] with FNCLEXImpl

trait FNCLEXImpl extends FNCLEX {
  implicit object FNCLEX_0 extends _0 {
    val opcode: OneOpcode = 0xDB /+ 4
        val hasRMByte = true
  }
}
