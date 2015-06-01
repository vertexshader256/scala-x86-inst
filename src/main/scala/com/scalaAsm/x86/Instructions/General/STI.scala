package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Interrupt Flag
// Category: general/flgctrl

trait STI extends InstructionDefinition {
  val mnemonic = "STI"
}

object STI extends ZeroOperands[STI] with STIImpl

trait STIImpl extends STI {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xFB
      }
}
