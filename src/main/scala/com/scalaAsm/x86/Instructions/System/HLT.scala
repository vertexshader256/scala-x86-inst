package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Halt
// Category: general

trait HLT extends InstructionDefinition {
  val mnemonic = "HLT"
}

object HLT extends ZeroOperands[HLT] with HLTImpl

trait HLTImpl extends HLT {
  implicit object HLT_0 extends _0 {
    val opcode: OneOpcode = 0xF4
        val hasRMByte = false
  }
}
