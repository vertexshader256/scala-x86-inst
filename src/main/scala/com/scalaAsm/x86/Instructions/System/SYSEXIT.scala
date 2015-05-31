package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Fast Return from Fast System Call
// Category: general/branch/trans

trait SYSEXIT extends InstructionDefinition {
  val mnemonic = "SYSEXIT"
}

object SYSEXIT extends ZeroOperands[SYSEXIT] with SYSEXITImpl

trait SYSEXITImpl extends SYSEXIT {
  implicit object SYSEXIT_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x35)
        override def hasImplicitOperand = true
  }
}
