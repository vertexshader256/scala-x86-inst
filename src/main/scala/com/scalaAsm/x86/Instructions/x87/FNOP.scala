package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: No Operation
// Category: general/control

trait FNOP extends InstructionDefinition {
  val mnemonic = "FNOP"
}

object FNOP extends ZeroOperands[FNOP] with FNOPImpl

trait FNOPImpl extends FNOP {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 2
      }
}
