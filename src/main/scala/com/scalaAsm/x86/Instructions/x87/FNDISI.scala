package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Disable NPX Interrupt
// Category: general/control

trait FNDISI extends InstructionDefinition {
  val mnemonic = "FNDISI"
}

object FNDISI extends ZeroOperands[FNDISI] with FNDISIImpl

trait FNDISIImpl extends FNDISI {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDB /+ 4
      }
}
