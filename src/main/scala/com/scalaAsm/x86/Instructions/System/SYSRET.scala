package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Return From Fast System Call
// Category: general/branch/trans

trait SYSRET extends InstructionDefinition {
  val mnemonic = "SYSRET"
}

object SYSRET extends SYSRET with ZeroOperands[SYSRET] with SYSRETImpl

trait SYSRETImpl {
  self: SYSRET =>
  implicit object SYSRET_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x07)
    override def hasImplicitOperand = true
  }
}
