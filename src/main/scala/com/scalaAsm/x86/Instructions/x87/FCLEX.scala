package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Clear Exceptions
// Category: general/control

trait FCLEX extends InstructionDefinition {
  val mnemonic = "FCLEX"
}

object FCLEX extends ZeroOperands[FCLEX] with FCLEXImpl

trait FCLEXImpl extends FCLEX {
  implicit object FCLEX_0 extends _0 {
    val opcode: OneOpcode = 0xDB /+ 4
        val hasRMByte = true
  }
}
